public int hashCode() {
    return (first == null ? 0 : first.hashCode()) ^ (second == null ? 0 : second.hashCode());
}