def XORLinkedList():
    class Node:

        def __init__(self,data,previous,nextN):
            self.data=data
            self.npx=previous^nextN

    class LinkedList:
        def __init__(self):
            self.memory=[]
            self.head=Node(None,-1,-1)
        
        def get_head(self):
            return self.head
        
                
        def insert(self,data):

        
            
            if self.head.npx^-1 is  -1:
                self.head=Node(data,0,-1)
                self.memory.append(self.head)
                
            else:
                temp=self.head
                previous=0
                cur=1
                nextN=temp.npx^previous
                while(nextN!=-1):
                    temp=self.memory[nextN-1]
                    previous,cur=cur,nextN
                    nextN=temp.npx^previous

                new_node=Node(data,cur,-1)
                temp.npx=previous^(cur+1)
                self.memory.append(new_node)

        def print(self):
                previous=0
                temp=self.head
                cur=1
                while(True):
                    print(temp.data)
                    nextN=temp.npx^previous
                    if(nextN==-1):
                        break
                    temp=self.memory[nextN-1]
                    previous,cur=cur,nextN
        
        def get(self,index):

            if(index<1 or index> len(self.memory)):
                print("Not a Valid Index")
                return
                
            
            temp=self.head
            cur=1
            previous=0
            for i in range(1,index):
                nextN=temp.npx^previous
                previous,cur=cur,nextN
                temp=self.memory[cur-1]
            print(temp.data)
    
    return LinkedList()

link=XORLinkedList()
link.insert(1)
link.insert(2)
link.insert(3)
link.insert(4)
link.print()
link.get(2)
#1-based Indexing
link.get(1)
link.get(3)
link.get(4)
link.get(5)