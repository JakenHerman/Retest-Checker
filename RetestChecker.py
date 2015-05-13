__author__ = 'JakenHerman'


from pandas import *
import matplotlib.pyplot as plt
import pandas as pd #this will make calling pandas easier later on
import sys #only needed to determine Python version number

# using the ExcelFile class
xlsx = pd.ExcelFile('test_sheet.xlsx')
data = xlsx.parse('Page1_1', index_col=None, na_values=['NA'])

# using the read_excel function
data = read_excel('test_sheet.xlsx', 'Page1_1', index_col=None, na_values=['NA']