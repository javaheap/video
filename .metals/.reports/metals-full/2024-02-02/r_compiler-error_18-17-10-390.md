file://<WORKSPACE>/src/main/java/TestLoop.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 45
uri: file://<WORKSPACE>/src/main/java/TestLoop.java
text:
```scala
package fr.utbm.main;
import java.util.loggi@@ng.Level;
import java.util.logging.Logger;

public class TestLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("test");
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestLoop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:342)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator