1. 克隆个人仓库到本地：`git clone git@github.com:wusuiwei/jacoco.git`
2. 添加源版本：`git remote add upstream git@github.com:jacoco/jacoco.git`
3. 查看所有远程仓库：`git remote -v`
4. 更新源版本更新到本地：`git fetch upstream`
5. 查看所有分支版本：`git branch -a`
6. 检出tag：`git checkout -b v0.8.8`
7. 切到主分支：`git checkout master`
8. 合并tag到主分支：`git merge v0.8.8`
7. 将合并后的代码提交到自己的git上
```git
git add .
git commit -m 'Sync from upsteam'
git push
```