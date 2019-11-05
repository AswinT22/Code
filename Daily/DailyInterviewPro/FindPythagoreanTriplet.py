
# def findPythagoreanTriplets(array ,size):
# # Fill this in.
#
#     square_array = [0]*size
#     for i in range(0, size):
#         square_array[i] = array[i]**2
#
#     square_array.sort()
#     for i in range(size-1, 1, -1):
#
#         j = 0
#         k = i-1
#         while j < k:
#             if square_array[j]+square_array[k] == square_array[i]:
#                 return "Yes"
#
#             if square_array[j]+square_array[k] < square_array[i]:
#                 j += 1
#                 continue
#
#             if square_array[j]+square_array[k] > square_array[i]:
#                 k -= 1
#
#     return "No"

import math

def findPythagoreanTriplets(array ,size):

    maximum = 0

    for i in range(0, size):
        maximum = max(maximum, array[i])

    hash_table = [0]*(maximum+1)

    for num in array:
        hash_table[num] += 1

    for a in array:
        for b in array:

            c = math.sqrt(a*a + b*b)

            if c % 1 == 0 and c <= maximum and hash_table[int(c)] > 0 :
                return "Yes"
    return "No"

for _ in range(int(input())):

    size = int(input())
    array = list(map(int, input().split()))
    print(findPythagoreanTriplets(array, size))

# print (findPythagoreanTriplets([3, 12, 5, 13]))
# True