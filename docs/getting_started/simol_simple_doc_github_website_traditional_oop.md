# Using traditional objects and interfaces in simol

## indef_obj

In simol, you can use traditional objects and classes, with the kind of objects named "indef_obj" (as INDEFinite OBJect).

So, if you don't want to give a role to a class, you can do it in simol, by giving the indefinite object role.
In the framework, simply use no annotation for the class, there are no equivalent annotation.

This role allows to keep free to choose, or not, a role. By doing this, inheritance is not checked for that type.

## compat_interf (or @Compat_interf in the framework)

In simol, this is not mandatory to use the interface roles. We can write "compat_interf" (compatibility interface), in case where we don't desire to choose a kind of interface. If we use that, there would be not compiler checks about this interface when used.

In the framework, just use no annotation for the interface, there are no such keyword.

This keyword allows to use traditional java interfaces (or of another underlying language), if needed or wanted. In theory, there is no need for this, but people could like it for some reasons.

## No simol annotations mandatory in the framework, except for @Forced_inh, and @Forced_int_inh

To keep flexible for Java (or else) developers, simol annotations are not mandatory at all, in the simol framework. For example, @Nature, @With_compat, and all other keywords, can be not used, in some cases or always. Even the concurrency keywords are in that case. The sole keywords that we muse use in the simol framework are those about forced inheritance(@Forced_inh, and @Forced_int_inh).

If we do not use @Nature, the nature check, obviously, will not be done.
