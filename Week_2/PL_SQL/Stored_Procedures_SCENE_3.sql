CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_account IN NUMBER,
  p_to_account   IN NUMBER,
  p_amount       IN NUMBER
) AS
  v_from_balance NUMBER;
BEGIN
  -- Fetch current balance of the source account
  SELECT Balance INTO v_from_balance
  FROM Accounts
  WHERE AccountID = p_from_account;

  -- Check if sufficient balance is available
  IF v_from_balance >= p_amount THEN
    -- Deduct from source account
    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_from_account;

    -- Add to destination account
    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_to_account;

    COMMIT; -- Save both updates
  ELSE
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in the source account.');
  END IF;
END;
