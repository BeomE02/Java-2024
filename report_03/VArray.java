class VArray {
    private int[] array;  // 내부 배열
    private int size;      // 현재 저장된 원소 개수
    private int capacity;  // 배열의 최대 용량

    // 생성자: 초기 용량을 설정
    public VArray(int initialCapacity) {
        this.capacity = initialCapacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    // 현재 배열의 용량 반환
    public int capacity() {
        return this.capacity;
    }

    // 현재 저장된 원소 개수 반환
    public int size() {
        return this.size;
    }

    // 배열의 마지막에 원소 추가
    public void add(int value) {
        if (size >= capacity) {
            resize();  // 용량 초과 시 배열 크기 늘리기
        }
        array[size] = value;
        size++;
    }

    // 배열의 특정 인덱스에 원소 삽입
    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (size >= capacity) {
            resize();  // 용량 초과 시 배열 크기 늘리기
        }
        // 원소 삽입을 위해 오른쪽으로 이동
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;  // 새로운 원소 삽입
        size++;
    }

    // 배열에서 특정 인덱스의 원소 제거
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        // 원소 제거를 위해 왼쪽으로 이동
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;  // 저장된 원소 개수 감소
    }

    // 배열 크기를 2배로 늘리기
    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // 배열의 모든 원소 출력
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
