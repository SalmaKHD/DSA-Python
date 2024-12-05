from collections import deque


class Node:
    value = 0
    index: int

    def __init__(self, value, index: int):
        self.value = value
        self.index = index


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

    def find_shortest_path_dfs(self, source_node: Node):
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


def main():
    graph = Graph(10)
    node_1 = graph.createNode(3)
    node_2 = graph.createNode(10)
    graph.addEdge(node_1, node_2)
    graph.printEdges(node_1)