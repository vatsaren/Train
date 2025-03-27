public class Main {
	public static void main(String[] args) {
		Warrior war = new Warrior();
		Mage mage = new Mage();
		Roge roge = new Roge();

		Visitor v = new Visitor();

		Damage mDamage = new Damage(10, DamageType.MAGIC);
		Damage pDamage = new Damage(17, DamageType.PHYSICAL);

		war.computeDamage(v, mDamage);
		war.computeDamage(v, pDamage);

		mage.computeDamage(v, mDamage);
		mage.computeDamage(v, pDamage);
		mage.setActiveMagicShield(true);
		mage.computeDamage(v, mDamage);

		roge.computeDamage(v, mDamage);
		roge.computeDamage(v, pDamage);
		roge.setActiveInvise(true);
		roge.computeDamage(v, mDamage);
		roge.setActiveInvise(true);
		roge.computeDamage(v, pDamage);
	}
}