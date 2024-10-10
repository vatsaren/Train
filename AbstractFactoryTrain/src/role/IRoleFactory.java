package role;

import role.IDamager;
import role.IHealer;
import role.ITank;

public interface IRoleFactory {

	ITank createTank();
	IHealer createHealer();
	IDamager createDamager();
}
