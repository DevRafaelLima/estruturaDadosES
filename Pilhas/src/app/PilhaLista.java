package app;

public class PilhaLista implements IPilha{
	private Noh topo;
	private int count = 0;
	@Override
	public boolean Push(Object info) {
		Noh novo = new Noh(info);
		if (this.isEmpty())
			topo = novo;
		else {
			novo.setProx(topo);
			topo = novo;
		}
		count++;
		return true;
	}

	@Override
	public Object Pop() {
		Object info = null;
		if (!this.isEmpty()){
			info = topo.getInfo();
			topo = topo.getProx();
		}
		count--;
		return info;
	}

	@Override
	public Object top() {
		return this.topo.getInfo();
	}

	@Override
	public boolean isEmpty() {
		if(this.topo == null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.count;
	}

}
