def solution(n, m):
    g = gcd(n,m)
    l = n * m / g
    return [g,l]

def gcd(n,m):
    return n if not m else gcd(m,n%m)