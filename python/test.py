def computepay(h, r):
    if h <= 40:
        p = h * r
    elif h > 40:
        extra = h - 40
        expay = r * (extra * 1.5)
        p = expay + (40 * r)
    return p

hrs = input("Enter Hours:")
hours = float(hrs)
rte = input("Enter Rate:")
rate = float(rte)
payy = computepay(hours, rate)
print("Pay", payy)
