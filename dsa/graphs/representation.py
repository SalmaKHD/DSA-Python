import heapq
from collections import deque


class Node:
    value = 0
    index: int
    weight: int

    def __init__(self, value, index: int, weight: int):
        self.value = value
        self.index = index
        self.weight = weight

class Graph:
    def __init__(self, max_size):
        # creating a list with all its values set to 0
        self.adjacency_matrix = [[0 for _ in range(max_size)] for _ in range(max_size)]
        self.adjacency_list = {}
        self.node_count = 0

    def createNode(self, value: int) -> Node:
        self.node_count += 1
        return Node(value, index=self.node_count - 1)

    # add edge via node
    # add edge using adjacency list
    def addEdge(self, node_1: Node, node_2: Node):
        # adjancy list
        if node_1.index not in self.adjacency_list:
            self.adjacency_list[node_1.index] = []
        if node_2.index not in self.adjacency_list:
            self.adjacency_list[node_2.index] = []
        self.adjacency_list[node_1.index].append(node_2.index)
        self.adjacency_list[node_2.index].append(node_1.index)
        self.node_count += 1

    # add edge via node index number
    def add_edge_adjancy_matrix(self, node_1: Node, node_2: Node):
        self.adjacency_matrix[node_1.index][node_2.index] = 1
        self.adjacency_matrix[node_2.index][node_1.index] = 1

    def printEdges(self, node: Node):
        print(
            f"Edges for Node {node.value} (Index {node.index}): {self.adjacency_list.get(node.index, [])}")

    def do_bfs(self, source_node: Node):
        if self.node_count == 0:
            return
        queue = deque()
        visited_nodes = [0] * self.node_count
        visited_nodes[source_node.index] = 1
        queue.append(source_node)
        while queue:
            current_node = queue.popleft()
            print(f"current node is: {current_node.value}")
            for neighbor_node in self.adjacency_list.get(current_node.index, []):
                if visited_nodes[neighbor_node.index] != 1:
                    queue.append(neighbor_node)
                    visited_nodes[neighbor_node.index] = 1

    def do_dfs(self, source_node_index, visited_nodes):
        if self.node_count == 0:
            return
        print(f"node just visited: {source_node_index}")
        visited_nodes.add(source_node_index)
        for neighbor_node in self.adjacency_list.get(source_node_index, []):
            if neighbor_node not in visited_nodes:
                self.do_dfs(neighbor_node, visited_nodes)

    def detect_cycle(self, source: Node):
        if source.index not in self.adjacency_list:
            return False
        #         cycle detected if in the process of dfs we encounter a node that has already been visited
        visited = set()
        return self.traverse(source, None, visited)
    def traverse(self, node: Node, parent_node: Node, visited):
        visited.add(node.index)
        for neighbor in self.adjacency_list.get(node.index, []):
            if neighbor not in visited:
                if self.traverse(neighbor, node, visited):
                    return True
            elif neighbor != parent_node:
                return True
        return False

    # for unweighted graphs
    def find_shortest_path_bfs(self, source_node: Node):
        distances = {}
        queue = deque()
        queue.append(source_node)
        current_node_distance = 1
        # first process, then dequeue at the end
        while queue:
            current_node = queue.popleft()
            for neighbor_node in self.adjacency_list.get(current_node, []):
                if neighbor_node not in distances:
                    distances[neighbor_node] = current_node_distance
                queue.append(neighbor_node)
            current_node_distance += 1

    # for weighted graphs
    def dijkstra(self, source: Node):
        distances = [float('inf')] * self.node_count
        pq = []
        heapq.heappush(pq, (0, source.index))
        distances[source.index] = 0
        while pq:
            current_distance, current_index = heapq.heappop(pq)
            if current_distance> distances[current_index]:
                continue
            for neighbor_index, weight in self.adjacency_list.get(current_index, []):
                distance = current_distance + weight
                if distance < distances[neighbor_index]:
                    distances[neighbor_index] = distance
                    heapq.heappush(pq, (distance, neighbor_index))
        return distances

    def topological_sorting(self, source:Node):
        visited = set()
        if source not in self.adjacency_list:
            return None
        queue = deque()
        self.topo_traverse(source, queue, visited)
        return list(queue)

    def topo_traverse(self, current_node: Node, queue, visited):
        if current_node in visited:
            return
        visited.add(current_node)
        for neighbor_node in self.adjacency_list.get(current_node, []):
            self.topo_traverse(neighbor_node, queue, visited)
        queue.appendleft(current_node)

    def bellmen_ford(self, source: Node):
        distances = [float('inf')] * self.node_count
        distances[source.index] = 0
        for i in range(self.node_count - 1):
            for node in self.adjacency_list:
                for neighbor_index, weight in self.adjacency_list[node]:
                    if distances[node] + weight < distances[neighbor_index]:
                        distances[neighbor_index] = distances[node] + weight

        for node in self.adjacency_list:
            for neighbor_index, weight in self.adjacency_list[node]:
                if distances[node] + weight < distances[neighbor_index]:
                    print("Graph contains a negative-weight cycle")
                    return None
        return distances



def main():
    graph = Graph(10)
    node_1 = graph.createNode(3)
    node_2 = graph.createNode(10)
    graph.addEdge(node_1, node_2)
    graph.printEdges(node_1)