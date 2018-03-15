library(lsr) 

timeThingDoc <- c(2173.2, 2130, 2430, 792, 2570, 1668, 680, 1272.6, 3151.2)
timeThingNoDoc <- c(3944, 2070.6, 2362.8, 3031, 2280, 2071.2, 1874, 1351.8)

wilcox.test(timeThingDoc, timeThingNoDoc) #p-value = 0.4807
cohensD(timeThingDoc, timeThingNoDoc) #0.6123149
mean(timeThingDoc) #1874.111
mean(timeThingNoDoc) #2373.175
svg("timeThing.svg")
boxplot(timeThingNoDoc, timeThingDoc, names = c("ThingML only", "ThingML+Docywood"), cex.axis=0.8, ylab = "Time (s)")
dev.off()

timeTPDDoc <- c(595, 375, 985.2, 654, 726, 364.8, 1170, 687.6)
timeTPDNoDoc <- c(722.4, 693.6, 860, 372, 930, 705, 369, 807.6, 421.2)

wilcox.test(timeTPDDoc, timeTPDNoDoc) #p-value = 0.9626
cohensD(timeTPDDoc, timeTPDNoDoc) #0.1685192
mean(timeTPDDoc) #694.7
mean(timeTPDNoDoc) #653.4222
svg("timeTPD.svg")
boxplot(timeTPDNoDoc, timeTPDDoc, names = c("TPD only", "TPD+Docywood"), ylab = "Time (s)")
dev.off()

resThingDoc <- c(96.36, 94.54, 90.9, 92.72, 80, 100, 100, 100, 81.81)
resThingNoDoc <- c(49.09, 92.72, 23.63, 67.27, 85.45, 63.63, 96.36, 92.72)

wilcox.test(resThingDoc, resThingNoDoc) #p-value = 0.04216
cohensD(resThingDoc, resThingNoDoc) #1.175874
mean(resThingDoc) #92.92556
mean(resThingNoDoc) #71.35875
svg("corrThing.svg")
boxplot(resThingNoDoc, resThingDoc, names = c("ThingML only", "ThingML+Docywood"), cex.axis=0.8, ylab = "Correctness (%)")
dev.off()

resTPDDoc <- c(100, 95, 85, 95, 100, 90, 90, 90)
resTPDNoDoc <- c(90, 95, 95, 90, 95, 95, 100, 90, 95)

wilcox.test(resTPDDoc, resTPDNoDoc) # p-value = 0.7588
cohensD(resTPDDoc, resTPDNoDoc) #0.1750137
mean(resTPDDoc) #93.125
mean(resTPDNoDoc) #93.88889
svg("corrTPD.svg")
boxplot(resTPDNoDoc, resTPDDoc, names = c("TPD only", "TPD+Docywood"), cex.axis=0.8, ylab = "Correctness (%)")
dev.off()

useful <- c(4, 3, 4, 3, 2, 4, 4, 4, 3, 4, 3, 4, 4, 5, 4, 3, 4)
example <- c(4, 4, 4, 3, 4, 5, 4, 2, 3, 4, 4, 4, 5, 5, 4, 3, 4)
readability <- c(3, 2, 3, 4, 3, 5, 4, 4, 4, 4, 4, 3, 3, 4, 4, 2, 3)
completeness <- c(4, 2, 4, 4, 2, 4, 3, 4, 3, 3, 4, 4, 3, 5, 3, 3, 4)
typing <- c(1, 4, 1, 4, 2, 4, 2, 4, 2, 4, 4, 2, 4, 4, 4, 3, 2)

mean(useful) #3.647059
mean(example) #3.882353
mean(readability) #3.470588
mean(completeness) #3.470588
mean(typing) #3

svg("rq3user.svg")
boxplot(useful, example, readability, completeness, typing, cex.axis=0.8, 
        names = c("Usefulness", "Example", "Readability", "Completeness", "Instructions"))
dev.off()








