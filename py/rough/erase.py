a=["Retention", 3, None]
b=a
z=["Retention", 3, None]
print(id(a))
print(id(b))
print(id(z))

print(a==b)
print(a==z)
print(z==b)

print(a is b)
print(a is z)
print(z is b)