# Java Banking System — Runtime Polymorphism

A beginner-friendly Java project that demonstrates runtime polymorphism through different bank classes and their interest rates.

## Features

- Creates a parent `Bank` class
- Creates `SBI`, `ICICI`, and `AXIS` child classes
- Uses method overriding for different rates of interest
- Uses a `Bank` array to store different bank objects
- Demonstrates the difference between method overriding and field hiding

## Technologies used

- Java
- Object-Oriented Programming
- Inheritance
- Runtime Polymorphism
- Method Overriding

## Project structure

```text
BankingSystem-RunTimePolymorphism/
└── lec_7_Polymorphism/
    └── assignment_1_BankingSystem_RunTimePoly/
        ├── Bank.java
        ├── SBI.java
        ├── ICICI.java
        ├── AXIS.java
        └── Main.java
```

## How it works

Each child class extends the `Bank` class and overrides the `getRateOfInterest()` method:

| Bank | Rate of interest |
| --- | ---: |
| SBI | 8.4% |
| ICICI | 7.3% |
| AXIS | 9.7% |

When the program calls `getRateOfInterest()` through a `Bank` reference, Java runs the correct child-class method at runtime.

## How to run

1. Open the project folder in a terminal.

2. Compile the Java files:

```bash
javac lec_7_Polymorphism/assignment_1_BankingSystem_RunTimePoly/*.java
```

3. Run the program:

```bash
java lec_7_Polymorphism.assignment_1_BankingSystem_RunTimePoly.Main
```

## Example output

```text
Bank name: SBI
Rate of interest: 8.4
Type: Parent Bank
________________________________________
```

## Key learning point

Methods can be overridden, so Java chooses the correct child method at runtime. Fields are not overridden; when accessed using a `Bank` reference, Java uses the parent class field.

## Author

Created by **Bsmala Mohamed Abdulhamid**.
