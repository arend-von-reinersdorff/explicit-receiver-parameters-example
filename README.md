Test Java 8 explicit receiver parameters.

See blog post <a href="http://blog.joda.org/2015/12/explicit-receiver-parameters.html">Explicit receiver parameters by Stephen Colebourne</a> 

<h1>Test with Checkstyle</h1>
<p>Run <code>mvn checkstyle:check</code></p>

<p>Result: Build fails, because parsing of Main.java fails.</p>


<h1>Test with PMD</h1>
<p>Run <code>mvn pmd:check -Dpmd.verbose=true</code></p>

<p>Result: Build succeeds. But it shouldn't, because the empty if block is a PMD violation.</p>

<p>To demonstrate that the build should really fail:</p>
<ol>
    <li>In Main.java comment out the Demo Block</li>
    <li>Run <code>mvn pmd:check</code></li>
    <li>Result: The build fails because the empty if block is a PMD violation</li>
</ol>
