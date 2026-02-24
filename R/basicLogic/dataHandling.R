#Data Handling and data cleaning in R
library(PortfolioAnalytics)
library(tidyverse)
library(patchwork)

var1 = c(1:10)
print(var1)
var2 = c(2,5,7,2,2,1,1,0,5,8)
barplot(var2, ylab="Value",xlab="Date")
hist(var1, prob=T)
hist(var2, prob=T)
print(NA)
c<-10
print(c)
d=10
print(d)
print(d==c)
