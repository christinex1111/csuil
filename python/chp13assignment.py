import urllib.request, urllib.parse, urllib.error
import xml.etree.ElementTree as ET
import ssl
import re

lst = []

data = '''<commentinfo>
<note>This file contains the actual data for your assignment - good luck!</note>
<comments>
<comment>
<name>Dione</name>
<count>99</count>
</comment>
<comment>
<name>Ariah</name>
<count>90</count>
</comment>
<comment>
<name>Izabel</name>
<count>87</count>
</comment>
<comment>
<name>Carmel</name>
<count>86</count>
</comment>
<comment>
<name>Willow</name>
<count>86</count>
</comment>
<comment>
<name>Madaki</name>
<count>85</count>
</comment>
<comment>
<name>Antonina</name>
<count>84</count>
</comment>
<comment>
<name>Ishwar</name>
<count>82</count>
</comment>
<comment>
<name>Rosina</name>
<count>81</count>
</comment>
<comment>
<name>Marcus</name>
<count>79</count>
</comment>
<comment>
<name>Mickey</name>
<count>79</count>
</comment>
<comment>
<name>Sukhpal</name>
<count>75</count>
</comment>
<comment>
<name>Wing</name>
<count>74</count>
</comment>
<comment>
<name>Calli</name>
<count>74</count>
</comment>
<comment>
<name>Lennan</name>
<count>73</count>
</comment>
<comment>
<name>Evelyn</name>
<count>67</count>
</comment>
<comment>
<name>Mylo</name>
<count>66</count>
</comment>
<comment>
<name>Ricards</name>
<count>66</count>
</comment>
<comment>
<name>Merin</name>
<count>65</count>
</comment>
<comment>
<name>Rhian</name>
<count>64</count>
</comment>
<comment>
<name>Rafal</name>
<count>59</count>
</comment>
<comment>
<name>Jenah</name>
<count>56</count>
</comment>
<comment>
<name>Clayton</name>
<count>51</count>
</comment>
<comment>
<name>Aslam</name>
<count>50</count>
</comment>
<comment>
<name>Julia</name>
<count>49</count>
</comment>
<comment>
<name>Damiana</name>
<count>49</count>
</comment>
<comment>
<name>Maisy</name>
<count>48</count>
</comment>
<comment>
<name>Breah</name>
<count>47</count>
</comment>
<comment>
<name>Zacharias</name>
<count>47</count>
</comment>
<comment>
<name>Blyth</name>
<count>43</count>
</comment>
<comment>
<name>Isak</name>
<count>43</count>
</comment>
<comment>
<name>Motade</name>
<count>42</count>
</comment>
<comment>
<name>Oakley</name>
<count>40</count>
</comment>
<comment>
<name>Samantha</name>
<count>39</count>
</comment>
<comment>
<name>Carson</name>
<count>37</count>
</comment>
<comment>
<name>Elysa</name>
<count>37</count>
</comment>
<comment>
<name>Annoushka</name>
<count>36</count>
</comment>
<comment>
<name>Brieghanna</name>
<count>28</count>
</comment>
<comment>
<name>Geordie</name>
<count>27</count>
</comment>
<comment>
<name>Jorja</name>
<count>22</count>
</comment>
<comment>
<name>Reuben</name>
<count>18</count>
</comment>
<comment>
<name>Jordanne</name>
<count>18</count>
</comment>
<comment>
<name>Candice</name>
<count>14</count>
</comment>
<comment>
<name>Anna</name>
<count>12</count>
</comment>
<comment>
<name>Derek</name>
<count>10</count>
</comment>
<comment>
<name>Abiola</name>
<count>7</count>
</comment>
<comment>
<name>Oluwatamilore</name>
<count>5</count>
</comment>
<comment>
<name>Cullin</name>
<count>4</count>
</comment>
<comment>
<name>Rosheen</name>
<count>3</count>
</comment>
<comment>
<name>Nialla</name>
<count>3</count>
</comment>
</comments>
</commentinfo>'''

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

nums = []
stringlst = data.split('delimiter')
for digit in stringlst:
    for subdigit in digit.split():
        if(subdigit.isdigit()):
            nums.append(digit)
print(nums)
'''findnumbers = re.compile(r'[0-9]+')
numbers = list(filter(findnumbers.match, stringlst))
print(numbers)'''
