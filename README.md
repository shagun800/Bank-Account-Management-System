# Bank Account Management System

A simple Java project that demonstrates basic **Object-Oriented Programming (OOP)** concepts and **exception handling** through a bank account.

## Features

* Create a bank account with a balance.
* Deposit money into the account.
* Withdraw money from the account.
* Check the current balance.
* Throw an exception when attempting to withdraw more than the available balance.

## Project Structure

```text
BankAccountManagement/
│
├── src/
│   ├── BankAccount.java
│   └── Main.java
│
├── .gitignore
└── README.md
```

## Concepts Used

* Classes and Objects
* Encapsulation
* Methods
* Conditional Statements
* Exception Handling
* `try-catch`
* `throw`

## How It Works

The `BankAccount` class contains a `balance` field and three main methods:

* `deposit(amount)` — adds money to the account.
* `withdraw(amount)` — withdraws money if sufficient balance is available.
* `getBalance()` — returns the current account balance.

If the withdrawal amount is greater than the available balance, an `IllegalArgumentException` is thrown.

## Example

```text
Initial Balance: ₹1000
Deposit: ₹500
Withdrawal: ₹300
Current Balance: ₹1200
```

If an attempt is made to withdraw more than the available balance:

```text
Error: Insufficient balance
```

## Requirements

* Java JDK 8 or higher
* Any Java IDE or code editor

## How to Run

Compile the Java files:

```bash
javac src/BankAccount.java src/Main.java
```

Run the program:

```bash
java -cp src Main
```

## Author

Shagun Vashishtha
