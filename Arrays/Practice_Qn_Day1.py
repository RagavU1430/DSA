#Qn : P1: Print every element of [5, 10, 15, 20] on one line separated by spaces.
arr = [5,10,15,20]
print(*arr)

#Qn2 : P2: Print only the elements at even indexes (0, 2, 4...) of [1, 2, 3, 4, 5, 6]. Expected: 1 3 5.
arr_q2 = [1,2,3,4,5,6]
for x in range(len(arr_q2)):
    if x % 2 ==0:
        print(arr_q2[x], end = " ")

#Qn3 : P3: Read n and an array, then print how many elements are greater than 10.
n = int(input())
arr_q3 = list(map(int, input().split()))
count = 0
for x in arr_q3:
    if x >= 10:
        count+=1
print(count)

#Qn4 : P4: Print the sum of only the even numbers. [1,2,3,4,5,6] gives 12.
arr_qn4 = [1,2,3,4,5,6]
sum = 0
for x in arr_qn4:
    if x % 2 == 0:
        sum += x
print(sum)

#Qn5 : P5: Print the smallest element using a loop (no min()). [8,3,9,1,5] gives 1.
arr_qn5 = [8,3,9,1,5]
small = arr_qn5[0]
for x in arr_qn5:
    if x < small:
        small = x
print(small)

#Qn6 : P6: Print the array in reverse on one line. [1,2,3,4] gives 4 3 2 1.
arr_qn6 = [1,2,3,4]
print(*arr_qn6[::-1])

#Two Sum : Brute Force Test Case 1 = [3, 2, 4], target 6, expected 1 2
nums = [3, 2, 4]
target = 6
for i in range(len(nums)):
    for j in range(i+1, len(nums)):
        if nums[i] + nums[j] == target :
            print(i,j, end = " ")
print()

#Two Sum : Brute Force Test Case 2 = [3, 3], target 6, expected 0 1
nums = [3, 3]
target = 6
for i in range(len(nums)):
    for j in range(i+1, len(nums)):
        if nums[i] + nums[j] == target :
            print(i,j, end = " ")

print()

##Two Sum : Dictionary Test Case 1 = [3, 2, 4], target 6, expected 1 2
nums = [3, 2, 4]
target_dict = 6
seen = {}
for i in range(len(nums)):
    need = target_dict - nums[i]
    if need in seen:
        print(seen[need] , i, end = " ")
    seen[nums[i]]=i
print()

##Two Sum : Dictionary Test Case 2 = [3, 3], target 6, expected 0 1
nums = [3, 3]
target_dict = 6
seen = {}
for i in range(len(nums)):
    need = target_dict - nums[i]
    if need in seen:
        print(seen[need] , i, end = " ") #for leetcode 'return seen[need], i
    seen[nums[i]]=i