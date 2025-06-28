CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  -- Loop through all savings accounts
  FOR acc_rec IN (
    SELECT AccountID, Balance
    FROM Accounts
    WHERE AccountType = 'Savings'
  ) LOOP
    -- Apply 1% interest to the current balance
    UPDATE Accounts
    SET Balance = acc_rec.Balance * 1.01
    WHERE AccountID = acc_rec.AccountID;
  END LOOP;

  COMMIT; -- Apply all updates permanently
END;
