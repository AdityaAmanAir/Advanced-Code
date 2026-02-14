v1 =  c( 3,8,7,6,5,3,4,3)
V1 = seq(0,10, by =2)
V2 = seq(from = -5, to = 10, along.with = df)
V3 = seq(0,10, length=100)
print(v1)

print(v1[3])
print(v1[3:5])

#To convert into int use as.integer()

for (variable in v1) {
  ifelse(variable==3,print("yes, 3!"), print("Searching..."))  
}

c("M","F","M","F","F","F","M")
v4=as.factor(c("M","F","M","F","M","F","M","F","F","F","M","F","F","M","M","F","M","F","F","F","M","M","F","M","F","F","F","M"))
class(v4)
v4
print(v4)
summary(v4)

v5=c(1,2,3,4,5,6,7,8,9,10,11,12,13,14)
mean(v5)

meanByMe=sum(v5)/length(v5)
myMeanNew= function(y){sum(y)/length(y)} #This is how we creata function in R just like javaScript
myMeanNew(V3)

mySD=function(z){
  sqrt(sum((z-myMeanNew(z))^2))/(length(z)-1)
}

print(mySD(V3))

for(i in 1:5){
  print(i)
}
