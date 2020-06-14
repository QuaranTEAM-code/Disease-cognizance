from selenium import webdriver
import time
import csv
import os
browser=webdriver.Chrome(r"C:\Users\karth\Desktop\chromedriver")
browser.get("https://www.worldometers.info/coronavirus/#countries")
time.sleep(3)
browser.find_element_by_xpath("""//*[@id="main_table_countries_today"]/thead/tr/th[1]""").click()



def check_boi(x,y):
    perm=[]
    for ele in x:
        if(y.lower()=="y"):
            if ele.text=='':
                perm.append(0)
            else:
                perm.append(ele.text)
        else:
            if ele.text=='':
                pass
            else:
                perm.append(ele.text)
    return(perm)


def scrappy_boi(x,count,link):
    tempPerm=[]

    for i in range(1,count+1):
        temp=browser.find_element_by_xpath(link+"""tr["""+str(i)+"""]/td["""+str(x)+"""]""")
        tempPerm.append(temp)
    ans=check_boi(tempPerm,"y")
    return(ans)


def removeBS(l,c):
    ans=[]
    for i in l:
        if i!=c:
            ans.append(i)
    return(ans)


runny=len(check_boi(browser.find_elements_by_class_name("odd"),"n"))+len(check_boi(browser.find_elements_by_class_name("even"),"n"))


parLink_1="""//*[@id="main_table_countries_today"]/tbody[1]/"""
    
parLink_2="""/html/body/div[3]/div[2]/div[1]/div/div[10]/div[2]/table/tbody/"""

parLink_3="""/html/body/div[3]/div[2]/div[1]/div/div[10]/div[1]/table/tbody/"""

#----------------------------------------------------------------- MAIN TABLE----------------------------------------------------------------------
country=scrappy_boi(1,runny,parLink_1)
totalCases=scrappy_boi(2,runny,parLink_1)
newCases=scrappy_boi(3,runny,parLink_1)
totalDeaths=scrappy_boi(4,runny,parLink_1)
newDeaths=scrappy_boi(5,runny,parLink_1)
totalRecovered=scrappy_boi(6,runny,parLink_1)
activeCases=scrappy_boi(7,runny,parLink_1)
critical=scrappy_boi(8,runny,parLink_1)


time.sleep(5)
browser.close()
final=list(zip(country,totalCases,newCases,totalDeaths,newDeaths,totalRecovered,activeCases,critical))
with open("sample.csv","w") as f:
    go=csv.writer(f)
    for i in range(len(final)):
        go.writerow(final[i])

#src = (r"C:\Users\karth\AppData\Local\Programs\Python\Python38-32\sample.csv")
#dst = (r"C:\Users\karth\AppData\Local\Programs\Python\Python38-32\a.txt")
        
#os.rename(src, dst)        

        
