
-- DROP TABLE AUTH PURGE;



CREATE TABLE Auth(
    USER_ID NUMBER GENERATED BY DEFAULT AS IDENTITY,
    username VARCHAR2(50) NOT NULL,
    password VARCHAR2(50) NOT NULL,
    is_active CHAR NOT NULL check (is_active in ('N','Y')),
    EMPLOYEE_ID	NUMBER(6) NOT NULL,
    CONSTRAINT AUTH_EMP_FK
        FOREIGN KEY (EMPLOYEE_ID)
        REFERENCES EMPLOYEES(EMPLOYEE_ID)	
);


INSERT INTO AUTH(
    USERNAME,
    PASSWORD,
    IS_ACTIVE,
    EMPLOYEE_ID
  )
VALUES
  (
    'SKing',
    'Password',
    'Y',
    100
  );

  INSERT INTO AUTH(
    USERNAME,
    PASSWORD,
    IS_ACTIVE,
    EMPLOYEE_ID
  )
VALUES
  (
    'NKochhar',
    'Password',
    'Y',
    101
  );


  COMMIT;


