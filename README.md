# fitness-rentals

[![Language](https://img.shields.io/badge/Language-Java-007396)](src)
[![Status](https://img.shields.io/badge/Status-Prototype-orange)]()

A small Java application that models a fitness equipment rental system (XFit). It provides simple CLI management for clients and equipment and simulates rental queries.

## Table of Contents

- [What This Project Does](#what-this-project-does)
- [Why This Project Is Useful](#why-this-project-is-useful)
- [Getting Started](#getting-started)
- [Usage Examples](#usage-examples)
- [Project Structure](#project-structure)
- [Where To Get Help](#where-to-get-help)
- [Maintainers and Contributions](#maintainers-and-contributions)

## What This Project Does

`fitness-rentals` is a small command-line Java program that allows you to:

- Register and manage clients (`Cliente`).
- Register and manage equipment (`Equipamento`).
- Query simulated remaining rental periods for equipment.
- Remove clients and equipment, and update their records.

The interactive entry point is `Aluguel` which shows a menu-driven CLI to exercise the available operations.

## Why This Project Is Useful

- Demonstrates basic Java classes and array-backed registries.
- Simple example for learning CLI input handling with `Scanner`.
- Provides a lightweight starting point for students learning object-oriented programming and basic state management.

## Getting Started

### Prerequisites

- Java 11+ (JDK) installed and `javac` / `java` available on your `PATH`.

### Build and run

From repository root run:

```bash
javac -d out src/*.java
java -cp out Aluguel
```

What this does:

1. Compiles all `.java` files into the `out` directory.
2. Launches the `Aluguel` CLI application.

## Usage Examples

After running `java -cp out Aluguel` you will see the menu with numbered options.

- To add a client, choose option `1` and follow prompts.
- To list clients, choose option `2`.
- To add equipment, choose option `3` and follow prompts.
- To query remaining rental days for an equipment, choose option `9`.

The application uses simple arrays with fixed sizes (clients: 10, equipment: 50). It prints helpful messages for full-capacity or not-found conditions.

## Project Structure

```text
.
├── README.md
├── src/
│   ├── Aluguel.java          # CLI entry point and menu
│   ├── CadastroCliente.java  # Client registry and operations
│   ├── CadastroEquipamento.java # Equipment registry and operations
│   ├── Cliente.java          # Client model
│   └── Equipamento.java      # Equipment model
```

## Where To Get Help

- Inspect the entrypoint [src/Aluguel.java](src/Aluguel.java) for the interactive menu and flow.
- For client-related logic see [src/CadastroCliente.java](src/CadastroCliente.java).
- For equipment-related logic see [src/CadastroEquipamento.java](src/CadastroEquipamento.java).

## Maintainers and Contributions

Maintainer:

- [@kydoa](https://github.com/kydoa)