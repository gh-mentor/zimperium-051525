# Bank Account Application

This project is a simple Java application that simulates a bank account system. It allows for the transfer of money between two bank accounts and displays the account balances.

## Project Structure

```
BankAccountApp
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── bankaccount
│   │   │               ├── BankAccount.java
│   │   │               ├── TransferTask.java
│   │   │               └── Main.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── bankaccount
│       │               └── BankAccountTest.java
│       └── resources
├── pom.xml
└── README.md
```

## How to Run

1. Ensure you have Java and Maven installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory in your terminal.
4. Run the following command to build the project:
   ```
   mvn clean install
   ```
5. After the build is successful, run the application using:
   ```
   mvn exec:java -Dexec.mainClass="com.example.bankaccount.Main"
   ```

## Features

- Create bank accounts with a specified name and balance.
- Transfer money between accounts.
- Display the current balance of each account.

## Testing

Unit tests are provided for the `BankAccount` class. To run the tests, use the following command:
```
mvn test
```

## License

This project is licensed under the MIT License.