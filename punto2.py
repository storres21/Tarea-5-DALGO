import sys
from collections import deque as queue
 
def order(matrix):
    nodes = list(range(0,len(matrix[0])))
    answer = []
    duplicate = list(range(0,len(matrix[0])))
    while len(duplicate)>0:
        start = duplicate[0]
        answer.append(BFS(matrix, nodes, start))
        for i in answer:
            for j in i:
                if j in duplicate:
                    duplicate.remove(j)
    return answer

 

 
def BFS(matrix, nodes, start):
    answer = []
    q = queue()
    visited = [False]*(len(nodes))
    q.append(start)
    visited[start]=True
    while (len(q) > 0):
        next = q.popleft()
        answer.append((next))
        for i in range(len(nodes)):
            if (matrix[next][i] == 1 and visited[i] == False):
                q.append(i)
                visited[i] = True
    return sorted(answer)




if __name__ == '__main__':
    matrix=[]
    listaFila =list((sys.stdin.readline()).strip(" ").split("\t"))
    matrix.append(listaFila)
    numeroFilas = len(listaFila)
    for i in range(numeroFilas-1):
        fila=list(sys.stdin.readline().strip(" ").split("\t"))
        matrix.append(fila)
    int_matrix = [[int(i) for i in inner_list] for inner_list in matrix]
    answer = order(int_matrix)
    print(answer)

 




"""
if __name__ == '__main__':
    string = input("ingrese la matriz")
    matrix = eval(string)
    answer = order(matrix)
    print(answer)
"""