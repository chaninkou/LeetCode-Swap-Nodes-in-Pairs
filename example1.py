import random
import sys
import os

print("This is how to code in Python")

places = "China"
print(places)

print("3 + 2 =", 3+2)
print("3 * 2 =", 3*2)
print("3 ** 2 =", 3**2)
print("3 % 2 =", 3%2)
print("3 / 2 =", 3/2)
print("3 // 2 =", 3//2)

sentence = "\"Always practice when you get home"

multi_sentence = '''no matter what"'''

print("%s %s %s" % ('You should always', sentence, multi_sentence))

print('\n' * 3)
print("This is ", end="")
print("Patrick")

print('\n' * 3)

gaming_list = ['League', 'overwatch', 'minecraft']

print('First game is ', gaming_list[0])

gaming_list[0] = "League of Legend"

print('First game is ', gaming_list[0])

print(gaming_list[0:3])

gaming_list2 = ['Crossfire', 'AOE']

combine_list = [gaming_list, gaming_list2]

print('Combine two lists: ', combine_list)

print((combine_list[0][1]))

