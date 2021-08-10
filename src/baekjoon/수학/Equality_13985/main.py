s = input()


a = int(s[:s.find('+')].replace(" ", ""))
b = int(s[s.find('+'):s.find('=')].replace(" ", ""))
r = int(s[s.find('=')+1:].replace(" ", ""))
print('YES' if a + b == r else 'NO')
