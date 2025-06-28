DECLARE
  v_today     DATE := SYSDATE;
  v_due_limit DATE := SYSDATE + 30;
BEGIN
  -- Fetch all loans that are due within the next 30 days
  FOR loan_rec IN (
    SELECT LoanID, CustomerID, DueDate
    FROM Loans
    WHERE DueDate BETWEEN v_today AND v_due_limit
  ) LOOP
    -- Display a reminder message for each upcoming loan
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Customer ' || loan_rec.CustomerID || 
      ', your Loan ID ' || loan_rec.LoanID || 
      ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
    );
  END LOOP;
END;
