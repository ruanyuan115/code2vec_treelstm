private void _set(int y1, int y2, int val, int nowIndex, int leftBound, int rightBound) {
    if (y1 <= leftBound && y2 >= rightBound) {
        isSet[nowIndex] = true;
        setVal[nowIndex] = val;
        incrVal[nowIndex] = 0;
        this.maintain(nowIndex, leftBound, rightBound);
        return;
    }
    boolean isPushDown = false;
    if (isSet[nowIndex] || incrVal[nowIndex] != 0) {
        isPushDown = true;
        this.pushdown(nowIndex, leftBound, rightBound);
    }
    int leftChild = this.getLeftChild(nowIndex);
    int rightChild = this.getRightChild(nowIndex);
    int mid = leftBound + (rightBound - leftBound) / 2;
    if (y1 <= mid) {
        this._set(y1, y2, val, leftChild, leftBound, mid);
    } else if (isPushDown) {
        this.maintain(leftChild, leftBound, mid);
    }
    if (y2 > mid) {
        this._set(y1, y2, val, rightChild, mid + 1, rightBound);
    } else if (isPushDown) {
        this.maintain(rightChild, mid + 1, rightBound);
    }
    this.maintain(nowIndex, leftBound, rightBound);
}