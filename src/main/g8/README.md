
# $name$

## Dev

### Run tests
```sh
./mill $name;format="space,snake,lower"$.test
```

### Publish locally
```sh
./mill $name;format="space,snake,lower"$.publishLocal
```

### Format all sources
```sh
./mill __.reformat
```

### Docs
```sh
./mill docs.hepek
```

Open `docs/hepek_output/index.html`

---

### Release

Add a new commit, tag it, and push atomically:
```sh
VERSION="0.0.1"
# \$VERSION="0.0.1" in PowerShell

git commit --allow-empty -m "Release \$VERSION"
git tag -a \$VERSION -m "Release \$VERSION"
git push --atomic origin main \$VERSION
```
