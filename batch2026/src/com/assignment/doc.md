# Food Ordering System — Documentation

A console-based food ordering application that demonstrates core Object-Oriented
Programming concepts in Java: **inheritance**, **polymorphism**, **encapsulation**,
and **method overriding**.

The user is presented with a menu, selects items (with customizations), and receives
an itemized bill with a grand total.

---

## Package

```
com.assignment
```

## Class Overview

| Class | Role | Extends |
|-------|------|---------|
| `FoodItem` | Base class for every menu item | — |
| `Pizza`    | Pizza menu item | `FoodItem` |
| `Burger`   | Burger menu item | `FoodItem` |
| `Drink`    | Drink menu item | `FoodItem` |
| `Desert`   | Dessert menu item | `FoodItem` |
| `Main`     | Entry point — interactive ordering loop | — |
| `Test`     | Standalone scratch class (menu loop demo) | — |

## Class Hierarchy

```
FoodItem
 ├── Pizza
 ├── Burger
 ├── Drink
 └── Desert
```

---

## `FoodItem` (Base Class)

The parent class that encapsulates the state and behaviour common to all menu items.

### Fields
| Field | Type | Description |
|-------|------|-------------|
| `itemName` | `String` | Name/flavour of the item (private) |
| `basePrice` | `Double` | Base price of the item (private) |

Both fields are **private**, exposed through public getters/setters — an example of
**encapsulation**.

### Constructors
- `FoodItem()` — no-arg constructor.
- `FoodItem(String itemName, Double basePrice)` — sets name and base price.

### Methods
| Method | Returns | Description |
|--------|---------|-------------|
| `getItemName()` / `setItemName(String)` | `String` / `void` | Accessor / mutator for name |
| `getBasePrice()` / `setBasePrice(Double)` | `Double` / `void` | Accessor / mutator for price |
| `calculatePrice()` | `Double` | Returns the price of the item. Overridden by subclasses. |
| `displayDetails()` | `void` | Prints the item name and price. Overridden by subclasses. |

---

## `Pizza`

Extends `FoodItem`. Base price is fixed at **50.0**.

### Field
| Field | Type | Description |
|-------|------|-------------|
| `extraCheese` | `boolean` | Whether extra cheese is added |

### Behaviour
- Constructor: `Pizza(String itemName, boolean extraCheese)` — passes `50.0` to the
  superclass as the base price.
- `calculatePrice()` **(overridden)** — adds **200.0** if `extraCheese` is `true`,
  otherwise returns the base price.
- `displayDetails()` **(overridden)** — prints the flavour and price, appending
  `"with extra cheese"` when applicable.

> Note: For Pizza the surcharge is applied inside `calculatePrice()`, so `getBasePrice()`
> stays at 50.0 while the calculated price reflects the cheese add-on.

---

## `Burger`

Extends `FoodItem`. Base price is **100.0**.

### Field
| Field | Type | Description |
|-------|------|-------------|
| `extraPatty` | `Boolean` | Whether an extra patty is added |

### Behaviour
- Constructor: `Burger(String itemName, Boolean extraPatty)` — passes `100.0` to the
  superclass and, if `extraPatty` is `true`, **adds 250.0 to the base price** directly.
- `calculatePrice()` **(overridden)** — returns the (already-adjusted) base price.
- `displayDetails()` **(overridden)** — prints the burger type and price, appending
  `"with extra patty"` when applicable.

> Note: Unlike Pizza, Burger folds the surcharge into `basePrice` in the constructor.

---

## `Drink`

Extends `FoodItem`. Base price is **20.0**.

### Field
| Field | Type | Description |
|-------|------|-------------|
| `size` | `String` | `"Small"`, `"Medium"`, or `"Large"` |

### Pricing by size
| Size | Surcharge | Total base price |
|------|-----------|------------------|
| Small (default) | +0.0 | 20.0 |
| Medium | +40.0 | 60.0 |
| Large | +80.0 | 100.0 |

### Behaviour
- Constructor: `Drink(String itemName, String size)` — passes `20.0` to the superclass,
  then adjusts the base price based on the size (case-insensitive match).
- `calculatePrice()` **(overridden)** — returns the adjusted base price.
- `displayDetails()` **(overridden)** — prints the drink name, price, and size.

---

## `Desert`

Extends `FoodItem`. Base price (per unit) is **50.0**.

### Field
| Field | Type | Description |
|-------|------|-------------|
| `qty` | `Integer` | Quantity ordered |

### Behaviour
- Constructor: `Desert(String itemName, Integer qty)` — passes `50.0` to the superclass.
  If `qty > 2`, applies a **10% bulk discount** to the total:
  `basePrice = (50.0 * qty) * 0.90`.
- `calculatePrice()` **(overridden)** — returns the adjusted base price.
- `displayDetails()` **(overridden)** — prints the dessert name, price, and quantity.

> Note: When `qty <= 2`, the base price stays at 50.0 (the per-unit price is **not**
> multiplied by quantity in that branch).

---

## `Main` (Entry Point)

Drives the interactive ordering session.

### Flow
1. Creates an empty `List<FoodItem>` to hold the order and a `Scanner` for input.
2. Loops, presenting the menu:
   ```
   press 1 for pizza
   press 2 for burger
   press 3 for Drink
   press 4 for Dessert
   ```
3. Based on the choice, prompts for details (name, customization) and adds the
   corresponding subclass instance to the list.
4. Asks *"do you want anything else? Y/N"*.
   - If **N**: prints a thank-you message, iterates the list calling `displayDetails()`
     on each item (**polymorphism** — the correct override runs per actual type),
     accumulates `calculatePrice()` into a total, prints the total, and exits the loop.
   - Otherwise the loop repeats.

### Key OOP concepts demonstrated
- **Polymorphism** — items are stored as `FoodItem` but each call to `displayDetails()`
  / `calculatePrice()` dispatches to the subclass override at runtime.
- **Inheritance** — all menu items reuse `FoodItem`'s fields and accessors.
- **Encapsulation** — state is private, accessed via getters/setters.

> Note: The total is declared as `int total`, so the accumulated `Double` prices are
> truncated to whole numbers in the printed total.

---

## `Test`

A standalone utility/scratch class unrelated to the ordering system. It runs a simple
menu loop (`1` to continue, `2` to exit) demonstrating a `while` loop with a `switch`.

---

## How to Compile & Run

From the project root:

```bash
# Compile
javac src/com/assignment/*.java

# Run (adjust the classpath root as needed)
java -cp src com.assignment.Main
```

### Example session
```
press 1 for pizza
press 2 for burger
press 3 for Drink
press 4 for Dessert
1
Please tell me pizza flavour
Fajita
Do you want extra cheese ? Y/N
Y
do you want anything else ? Y/N
N
Thank you for your order
Pizza flavour is Fajita and price is 50.0 with extra cheese
Your total amount is :250
```

---

## Summary of Pricing Rules

| Item | Base | Customization surcharge |
|------|------|-------------------------|
| Pizza | 50.0 | +200.0 for extra cheese |
| Burger | 100.0 | +250.0 for extra patty |
| Drink | 20.0 | +40.0 medium, +80.0 large |
| Desert | 50.0 | 10% discount on total when qty > 2 |
