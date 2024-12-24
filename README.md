# Unexpected removeIf Behavior in Kotlin MutableList
This repository demonstrates a subtle bug in Kotlin related to the `removeIf` function used with a `MutableList`. The issue arises when attempting to remove elements from a list while iterating over it using `removeIf`.  The standard `removeIf` function modifies the list in-place which causes index shifting and skipped items.

## The Bug
The provided `bug.kt` file contains code that illustrates this issue. The code intends to remove even numbers from a list, but due to the modification of the list during iteration, some odd numbers may unexpectedly remain.

## The Solution
The `bugSolution.kt` file provides a corrected solution using an iterator to safely remove elements from the list during iteration.