public class Iterator implements IIterator {

	private Integer currIndex = 0;
	private ICollection collection;

	public Iterator(ICollection collection) {
		this.collection = collection;
	}


	@Override
	public Integer getNext() {
		if (hasNext()) {
			Integer res = collection.getArray().get(currIndex);
			currIndex++;
			return res;
		}
		return null;
	}

	@Override
	public Boolean hasNext() {
		return currIndex < collection.getArray().size();
	}
}
