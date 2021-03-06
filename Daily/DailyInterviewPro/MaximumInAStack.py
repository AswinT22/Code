# Implement a class for a stack that supports all the regular functions (push, pop)
# and an additional function of max() which returns the maximum element in the stack (return None if the stack is empty).
# Each method should run in constant time.

class MaxStack:
    def __init__(self):
        self.max_array=[]
        self.array_list=[]
    # Fill this in.

    def push(self, val):
    # Fill this in.

        if len(self.array_list)<1 or self.array_list[-1] <= val:
            self.max_array.append(val)

        self.array_list.append(val)





    def pop(self):
    # Fill this in.
        if len(self.array_list)<1:
            if self.array_list[-1] == self.max_array[-1]:
                self.max_array.pop()

            self.array_list.pop()
        else:
            print("Stack is empty")




    def max(self):
        if len(self.array_list)<1:
            return self.max_array[-1]
        else:
            return "Stack is empty"
# Fill this in.

s = MaxStack()
s.push(1)
s.push(2)
s.push(3)
s.push(2)
print (s.max())
# 3
s.pop()
s.pop()
print(s.max())
# 2