def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair


#Returns the first element of the pair
def car(pair):
    def left(a,b):
        return a

    return pair(left)
    

#Returns the last element of the pair
def cdr(pair):
    def right(a,b):
        return b

    return pair(right)



print(car(cons(3,4)))
print(cdr(cons(3,4)))

# This problem was asked by Jane Street.

# cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. 
# For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

# Given this implementation of cons:

# def cons(a, b):
#     def pair(f):
#         return f(a, b)
#     return pair
# Implement car and cdr.