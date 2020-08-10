package com.test.sort;

public class HeapSort {
	public static void main(String[] args) {
		int[] sort = new int[] {31, 8, 48, 11, 3, 73, 20, 29, 65, 15};
		//heapSort(sort);
		//printArray(sort);
		
		System.out.println((long) Math.sqrt(0));
	}
	
	private static void printArray(int[] sort) {
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println();
	}
	
	private static void heapSort(int[] sort) {
		
		//최초로 Max heap을 만듬
		for(int i = sort.length /2 ; i >=0; i--) {
			heapify(sort, sort.length, i);
		}
		
		//첫 번째 인덱스 값을 맨 뒤 배열과 바꾸고
		//바뀐 첫 번째 인덱스를 가지고 heapify 진행
		
		for(int i = sort.length-1; i > 0; i--) {
			swap(sort, 0, i); //항상 맨뒤가 아니라 이전 최대값의 전 인덱스
			heapify(sort, i, 0); 
			// 맨위에서는 sort의 크기를 가운데 인자값으로 넣었으나 여기서 i를 넣은 이유는
			// 당연히 최대 값을 sort 배열 맨뒤로 계속해서 옮겼기 때문에 그걸 뺀 만큼 크기를 비교
			// 하기 위해서 이다.
		}
	}

	private static void heapify(int[] sort, int n, int i) {
		// sort 크기이다. (항상 고정 값이 아니라 최대값을 찾아서 맨뒤로 보낸 경우 그건 제외시켜야
		// 하므로 n도 수시로 바뀐다.
		// i는 내가 heapify 할 배열의 위치
		int parent = i;
		int leftChild = i * 2;
		int rightChild = i * 2 + 1;
		
		//왼쪽 노드가 있고 내가 비교할 노드보다 크다면 일단 leftchild라고 생각해두다가
		if(leftChild < n && sort[parent] < sort[leftChild]) {
			parent = leftChild;
		}
		// 오른쪽 노드가 존재하고 왼쪽 노드보다 크다면 or 왼쪽 노드가 내가 비교할 노드보다 작아서
		// 오른쪽 노드와 부모노드랑 비교했을 때 오른쪽 노드가 크다면 rightchild로 확정
		if(rightChild < n && sort[parent] < sort[rightChild]) {
			parent = rightChild;
		}
		// 그래서 부모노드가 바뀔 예정이라면 실제 바꿔주고
		if(parent != i) {
			swap(sort, parent, i);
			heapify(sort, n, parent);
			//바뀐 부모노드로 이동하여 heapify 해준다.
		}
		
	}

	private static void swap(int[] sort, int parent, int i) {
		int temp = sort[parent];
		sort[parent] = sort[i];
		sort[i] = temp;
	}
}
