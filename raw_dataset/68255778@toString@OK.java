@Override
public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Node [v=");
    builder.append(v);
    builder.append(", count=");
    builder.append(count);
    builder.append(", parent=");
    builder.append(parent != null ? parent.v : "null");
    builder.append("]");
    return builder.toString();
}