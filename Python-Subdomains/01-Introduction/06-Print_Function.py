if __name__ == '__main__':
    n = int(input())
    myList = []
    for i in range(n):
        myList.append(i+1)
    for i in range(n):
        print(myList[i], end="")
