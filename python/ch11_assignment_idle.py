import re

fle = open('regex_sum_131324.txt', 'r')

lst = []
summ = 0

for line in fle:
    nums = re.findall('[0-9]+', line)
    if len(nums) == 0:
        continue
    lst += nums

for num in lst:
    summ = summ + int(num)
print(summ)
    
