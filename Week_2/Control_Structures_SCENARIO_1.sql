BEGIN
  -- Loop through all customers
  FOR cust_rec IN (
    SELECT CustomerID, Age, InterestRate
    FROM Customers
  ) LOOP
    -- Check if the customer is above 60 years old
    IF cust_rec.Age > 60 THEN
      -- Apply a 1% discount to their loan interest rate
      UPDATE Customers
      SET InterestRate = InterestRate - 1
      WHERE CustomerID = cust_rec.CustomerID;
    END IF;
  END LOOP;

  COMMIT; -- Save all updates
END;

