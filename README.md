# Numbered Hourglass Pattern in Java

## Description
This Java program generates a **numbered hourglass pattern** based on user input. It first prints the upper half of the pattern, which decreases in width, followed by a symmetric lower half. The numbers in each row form a **palindromic sequence**, creating a visually appealing hourglass shape.

## Code Explanation

### 1. Importing Scanner Class
```java
import java.util.Scanner;
```
The **Scanner** class is imported from `java.util` to take user input dynamically.

### 2. Class Declaration
```java
public class Numbered_HourGlass
```
The class **Numbered_HourGlass** is defined as the main class for execution.

### 3. Main Method
```java
public static void main(String[] args)
```
The `main` method is the entry point of the program.

### 4. Creating Scanner Object
```java
Scanner s  = new Scanner(System.in);
System.out.println("Enter the number");
int n = s.nextInt();
```
- `Scanner s = new Scanner(System.in);` creates a **Scanner** object to read input from the user.
- `System.out.println("Enter the number");` prompts the user to enter an integer value.
- `int n = s.nextInt();` stores the user input in the variable `n`.

### 5. Printing the Upper Half of the Hourglass
```java
for(int i=1; i<=n; i++)
```
- **Outer loop** (`i`) runs from `1` to `n` and controls the number of rows.
- Inside this loop:
  
#### Adding Leading Spaces
```java
for(int j=1; j<=i; j++)
{
    System.out.print(" ");
}
```
- **Inner loop** (`j`) adds spaces before the numbers to shift them rightward.

#### Printing Ascending Numbers
```java
int num = 1;
for(int j=i; j<n; j++)
{
    System.out.print(num++);
}
```
- Starts with `num = 1` and prints numbers in ascending order.
- The loop runs until `j < n`.

#### Printing Descending Numbers
```java
for(int j=i; j<=n; j++)
{
    System.out.print(num--);
}
```
- Continues from the last number printed and decreases back to `1`.
- Ensures symmetry in the pattern.

### 6. Printing the Lower Half of the Hourglass
```java
for(int i=2; i<=n; i++)
```
- **Outer loop** starts from `2` to avoid repeating the middle row.
- Structure is similar to the first half but in reverse order.

#### Adding Leading Spaces
```java
for(int j=i; j<=n; j++)
{
    System.out.print(" ");
}
```
- Spaces decrease as rows increase.

#### Printing Ascending and Descending Numbers
```java
int num = 1;
for(int j=1; j<i; j++)
{
    System.out.print(num++);
}
for(int j=1; j<=i; j++)
{
    System.out.print(num--);
}
```
- Works similarly to the first half but mirrored.

### 7. Closing Scanner
```java
s.close();
```
Closes the **Scanner** object to prevent memory leaks.

## Example Output
```
Enter the number: 4
1234321
 12321
  121
   1
  121
 12321
1234321
```

## Summary
This program utilizes:
- **Scanner** class for user input
- **For loops** to control spacing and number printing
- **Nested loops** for symmetry
- **Printing statements** to display a palindromic hourglass pattern

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Numbered_HourGlass.git
```
