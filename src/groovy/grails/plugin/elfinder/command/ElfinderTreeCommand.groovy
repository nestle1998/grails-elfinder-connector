package grails.plugin.elfinder.command

/**
 * 
 * @author Sudhir Nimavat
 *
 */
class ElfinderTreeCommand extends ElfinderBaseCommand {

	@Override
	public void execute() {
		String target = params['target']
		if(!target) {
			addError("errOpen")
		} else {
			tree(target)
		}
	}
}
