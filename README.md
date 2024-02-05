
# LeetCode Challenge D44

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [953. Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different  `order`. The  `order`  of the alphabet is some permutation of lowercase letters.

Given a sequence of  `words`  written in the alien language, and the  `order`  of the alphabet, return  `true`  if and only if the given  `words`  are sorted lexicographically in this alien language.

**Example**
>**Input:** words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
>
>**Output:** true
>
>**Explanation:** As 'h' comes before 'l' in this language, then the sequence is sorted.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The solution initializes an `ArrayList<Character>` named `orderList` to represent the order of characters in the alien language. The main loop compares adjacent pairs of words, examining each character position to ensure they follow the prescribed order. To handle prefix cases where one word is a prefix of another, it checks if the current position exceeds the length of the next word. If true, it returns `false`. The code then compares the positions of characters in the alien language using the `indexOf` method and the preconstructed `orderList`. If at any point the next character is found to be lexicographically before the current one, the function returns `false`. If the loop completes without returning `false`, it indicates that the words are sorted according to the alien language order, and the function returns `true`. The solution is clear, utilizing an `ArrayList` to efficiently represent the alien language order and handling various scenarios for accurate lexicographical comparison.
