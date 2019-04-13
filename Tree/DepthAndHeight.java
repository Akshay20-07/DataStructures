public int depth(Position<E> p){
	if(isRoot(p))
	  return 0;
	else 
	  return 1+depth(parent(p));
}
public int height(Position<E> p){
	int h=0;
	for(Position<E> c :children(p))
	  h=Math.max(h,1+height(c));
	return h;
}