package lesson7

/**
 * " "
 * ' '
 * """ """
 * ''' '''
 * / /
 * $/ /$
 */

def name = "Pavel"
char valueChar = 'H'
def value = 'Hello "Pavel"'

def stringValue = "Hello $name"

def value2 = """
SELECT *
FROM
table
WHERE name = ${getWithPrefix(name)}
"""

def value3 = '''
SELECT *
FROM
table
WHERE name = $name
'''

def value4 = /Hello world $name/

def value5 = $/Hello world $name/$

println name[2]
println name[-1]
println name[1..3]
println name * 3
println name - 'Pa'
println name - 'v'

def getWithPrefix(String name) {
    "prefix-" + name
}

