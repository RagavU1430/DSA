#creation of array
arr = [10,20,30,40,50]
print(arr)

arr[3] = 55 #update array [10,20,30,55,50]
print(arr)

#sum using loop
total = 0
for x in arr:
    total += x
print("The Sum using loop : ", total)

#in built function
print("The Sum using inbbuilt function : ", sum(arr))

#max using loop
big = arr[0]
for x in arr:
    if x>big:
        big = x
print("The big using loop : ", big)

#in built function
print("The Big using inbbuilt function : ", max(arr))

#io
n = int(input())
arr_new = list(map(int, input().split()))
total_new =0
for x in arr_new:
    total_new += x
print(arr_new)
print(total_new)