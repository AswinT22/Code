
# https://www.hackerearth.com/practice/basic-programming/complexity-analysis/time-and-space-complexity/practice-problems/algorithm/vowel-game-f1a1047c/
def count_vowel(string,):
    vowel = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]
    count = 0
    length=len(string)
    for i in range(0, length):

        if(string[i] in vowel):
            number=(length-i)
            count += (number+(number*(i)))

    return count


for _ in range(int(input())):

    string = input()

    print(count_vowel(string))


