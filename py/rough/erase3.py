# Open file for reading and appending
f = open("practice.txt", "a+")  # Use "a+" for append and read

# Move to beginning to read
f.seek(0)

# Read and print content
for x in f:
    print(x, end="")  # end="" removes extra newlines

# Get user input
y = input("Enter text to append: ")

# Append to file
f.write(y + "\n")