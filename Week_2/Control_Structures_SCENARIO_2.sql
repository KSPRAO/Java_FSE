BEGIN
  -- Iterate through all customers
  FOR cust_rec IN (
    SELECT CustomerID, Balance
    FROM Customers
  ) LOOP
    -- Check if the customer balance is more than $10,000
    IF cust_rec.Balance > 10000 THEN
      -- Set IsVIP flag to TRUE
      UPDATE Customers
      SET IsVIP = 'TRUE'
      WHERE CustomerID = cust_rec.CustomerID;
    END IF;
  END LOOP;

  COMMIT; -- Save all updates
END;
